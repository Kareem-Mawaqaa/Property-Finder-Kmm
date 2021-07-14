//
//  MainTabBarController.swift
//  flythru-porter
//
//  Created by Kareem Radwan on 7/12/21.
//

import UIKit

class MainTabBarController: UITabBarController {
    
    

    override func viewDidLoad() {
        super.viewDidLoad()

        UITabBar.appearance().tintColor = UIColor(named: "second_color")
        
        let ordersItem = UITabBarItem()
        ordersItem.title = "ORDERS"
        ordersItem.image = UIImage(named: "img_orders")

        let ordersVC =  OrdersViewController()
        ordersVC.tabBarItem = ordersItem
  
        
        let submitedItem = UITabBarItem()
        submitedItem.title  = "SUBMITED"
        submitedItem.image = UIImage(named: "img_submited")
        
        let submitedVC = SubmitedViewController()
        submitedVC.tabBarItem = submitedItem
        
        let notificationsItem = UITabBarItem()
        notificationsItem.title  = "NOTIFICATIONS"
        notificationsItem.image = UIImage(named: "img_notificatons")
        
        let notificationsVC = NotificationsViewController()
        notificationsVC.tabBarItem = notificationsItem
        
        
        
        
        viewControllers = [ordersVC , submitedVC , notificationsVC]
        // Do any additional setup after loading the view.
    }


   
}
