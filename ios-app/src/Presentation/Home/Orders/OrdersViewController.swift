//
//  OrdersViewController.swift
//  flythru-porter
//
//  Created by Kareem Radwan on 7/12/21.
//

import UIKit
import MultiPlatformLibrary
import ProgressHUD

class OrdersViewController: UIViewController {
    
    
    var itemSelected = -1
    
    @IBOutlet var tableView: UITableView!
    
    let viewModel = OrdersViewModel()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        tableView.dataSource = self
        tableView.delegate = self
        
        let textFieldCell = UINib(nibName: "OrderTableViewCell",bundle: nil)
        self.tableView.register(textFieldCell, forCellReuseIdentifier: "CustomTableViewCell")
        self.tableView.separatorStyle = UITableViewCell.SeparatorStyle.none
        self.tableView.rowHeight = UITableView.automaticDimension
        //        self.tableView.estimatedRowHeight = 80

        
        viewModel.viewState.addObserver { dataState in
            
            if (dataState?.loading == true){
                ProgressHUD.show()
            }else{
                ProgressHUD.dismiss()
            }
            
            
            if let _ = dataState?.data {
                
                self.tableView.reloadData()
                
            }
            
            if let error = dataState?.error {
                print("Success Items \(error)")
                
            }
            
            
        }
        
    }
    
    
    
}


extension OrdersViewController : UITableViewDelegate , UITableViewDataSource {
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 1
    }
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return viewModel.viewState.value?.data?.collectedOrderResponse?.orders?.count ?? 0
    }
    
//    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
//        return UITableView.automaticDimension
//    }
    
    func tableView(_ tableView: UITableView, viewForHeaderInSection section: Int) -> UIView? {
        let emptyView = UIView()
        emptyView.frame = CGRect(x:0, y: 0, width:0, height:10)
        return emptyView
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let reuseIdentifier = "CustomTableViewCell"
        let cell: OrderTableViewCell = tableView.dequeueReusableCell(withIdentifier: reuseIdentifier) as! OrderTableViewCell
        
        let model =  viewModel.viewState.value?.data?.collectedOrderResponse?.orders![indexPath.section]
        cell.bind(model: model as! Orders)
        
        cell.bodyCard.isHidden = itemSelected != indexPath.section
        if (indexPath.section == itemSelected){
            cell.bodyCard.fadeIn()
        }
        
        return cell
    }
    
    
    
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        if (itemSelected == indexPath.section){
            itemSelected = -1
            self.tableView.reloadData()
            return
        }
        
        itemSelected = indexPath.section
        self.tableView.reloadData()
        print("didSelectRowAt \(indexPath.section)")
    }
    
    
}




extension UIView {

    func fadeIn(_ duration: TimeInterval? = 0.2, onCompletion: (() -> Void)? = nil) {
        self.alpha = 0
        self.isHidden = false
        UIView.animate(withDuration: duration!,
                       animations: { self.alpha = 1 },
                       completion: { (value: Bool) in
                          if let complete = onCompletion { complete() }
                       }
        )
    }

    func fadeOut(_ duration: TimeInterval? = 0.2, onCompletion: (() -> Void)? = nil) {
        UIView.animate(withDuration: duration!,
                       animations: { self.alpha = 0 },
                       completion: { (value: Bool) in
                           self.isHidden = true
                           if let complete = onCompletion { complete() }
                       }
        )
    }

}
