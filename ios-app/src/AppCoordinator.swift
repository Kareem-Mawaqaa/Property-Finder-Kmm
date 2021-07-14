//
//  AppCoordinator.swift
//  ios-app
//
//  Created by Andrew Kovalev on 02.05.2021.
//  Copyright © 2021 IceRock Development. All rights reserved.
//

import UIKit
import MultiPlatformLibrary

class AppCoordinator: BaseCoordinator {
    
    override func start() {
        if (AppComponent.factory.keyValueStorage.token != nil && AppComponent.factory.keyValueStorage.token != ""){
            
            let vc = MainTabBarController()
            self.window.rootViewController = vc
            
        }else {
        
        let vc = LoginViewController()
        self.window.rootViewController = vc
        }
    }
    
}
