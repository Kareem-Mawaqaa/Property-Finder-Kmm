//
//  LoginViewController.swift
//  ios-app
//
//  Created by Kareem Radwan on 7/4/21.
//  Copyright © 2021 IceRock Development. All rights reserved.
//

import UIKit
import MultiPlatformLibrary

class LoginViewController: UIViewController  , LoginView{
  
    
    func goToHomeScreen() {
        let homeVC = HomeVC()
        navigationController?.present(homeVC, animated: true, completion: nil)

    }
    
 
    func onLoginSuccess(response: LoginResponse) {
        print("onLoginSuccess \(response.APIMessage)")
    }
    
    func onError(error: BaseError) {
        print("onError \(error.message)")
    }
    
    func onLoading(status: Bool) {
        print("onError \(status)")
    }
    

    
    lazy var viewModel = LoginViewModel()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        viewModel.attachView(view : self)
      

        // Do any additional setup after loading the view.
        
    }

    @IBAction func loginButton(_ sender: Any) {
        
        
        viewModel.login(request: LoginRequest(APIKey: "123456", LanguageID: 1, oCustomer: OCustomer(DeviceID: "12345", DevicePlatform: 1, DeviceToken: "", Email: "kareem@mawaqaa.com", Password: "12345")))
        
    }
    
    
    override func viewDidDisappear(_ animated: Bool) {
        viewModel.deAttachView()
    }
   
}
