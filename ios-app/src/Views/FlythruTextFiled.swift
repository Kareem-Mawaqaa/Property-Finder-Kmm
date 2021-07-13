//
//  FlythrTextFiled.swift
//  flythru-porter
//
//  Created by Kareem Radwan on 7/11/21.
//

import UIKit

@IBDesignable
open class FlythruTextFiled: UITextField {
    
    func setup() {
   
        
        layer.cornerRadius = 21
//        layer.borderColor =
        layer.borderColor = UIColor(named: "second_color")?.cgColor
        layer.borderWidth = 1
        clipsToBounds = true
        
        
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
