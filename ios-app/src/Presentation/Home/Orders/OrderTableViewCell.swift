//
//  OrderTableViewCell.swift
//  ios-app
//
//  Created by Kareem Radwan on 7/14/21.
//  Copyright © 2021 IceRock Development. All rights reserved.
//

import UIKit
import MultiPlatformLibrary
class OrderTableViewCell: UITableViewCell {

    @IBOutlet var title: UILabel!
    @IBOutlet var subTitle: UILabel!
    
    @IBOutlet var bodyCard: UIStackView!
    
    override func awakeFromNib() {
        super.awakeFromNib()
        

        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)
        print("setSelected \(selected)")
        // Configure the view for the selected state
    }
    
    func bind(model : Orders)  {
        title.text = "\(String(describing: model.airport?.name ?? "" ) )"
        subTitle.text = "ORDER NO. \(String(describing: model.number_order ?? ""))"
    }
    
    override func layoutSubviews() {
        // add shadow on cell
        backgroundColor = .clear // very important
        layer.masksToBounds = false
//        layer.shadowOpacity = 0.23
        layer.cornerRadius = 16
        layer.borderWidth = 1
        layer.borderColor = UIColor.gray.cgColor


        // add corner radius on `contentView`
        contentView.backgroundColor = .white
        contentView.layer.cornerRadius = 0
        
//        let margins = UIEdgeInsets(top: 5, left: 8, bottom: 5, right: 8)
//        contentView.frame = contentView.frame.inset(by: margins)
//        contentView.layer.cornerRadius = 8
    }
    
}
