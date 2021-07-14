//
//  FlythruButton.swift
//  ios-app
//
//  Created by Kareem Radwan on 7/14/21.
//  Copyright © 2021 IceRock Development. All rights reserved.
//

import UIKit

@IBDesignable
open class FlythruButton: UIButton {
    
    func setup() {
    
   

        layer.cornerRadius = 21
//        layer.borderColor =
        layer.borderColor = UIColor(named: "primary_color")?.cgColor
        layer.borderWidth = 1
        clipsToBounds = true
       
        self.tintColor = UIColor(named: "second_color")
        self.titleLabel?.textColor = UIColor(named: "second_color")
        self.backgroundColor = UIColor(named: "primary_color")
//        titleLabel?.textColor = ?.cgColor
        
//        layer.masksToBounds = true
    }
    
    override init(frame: CGRect) {
        super.init(frame: frame)
        setup()
    }
    required public init?(coder aDecoder: NSCoder) {
        super.init(coder: aDecoder)
        setup()
    }
    
    
    
   
    
}
