//
//  LoginViewController.swift
//  flythru-porter
//
//  Created by Kareem Radwan on 7/11/21.
//

import UIKit
import MultiPlatformLibrary
import ProgressHUD


class LoginViewController: UIViewController , UITextFieldDelegate {
    
    
    @IBOutlet weak var edPassword: UITextField!
    
    @IBOutlet weak var edUsername: UITextField!
    
    let viewModel = LoginViewModel()
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // TODO Setup TextFiled Delegates
        self.edPassword.delegate = self
        self.edUsername.delegate = self
        
        viewModel.viewState2.addObserver { dataState in
            
            if (dataState?.loading == true){
                ProgressHUD.show("Loading")
            }else{
                ProgressHUD.dismiss()
            }
            
            
            self.runSafe(parameter: dataState?.data){
                if  let response = dataState?.data?.loginResponse {
                    if (response.status == "success"){
                        let home = MainTabBarController()
                        let navVC = UINavigationController(rootViewController:home)
                        navVC.modalPresentationStyle = .fullScreen
                        navVC.isNavigationBarHidden = true
                        self.present(navVC, animated: true, completion:nil)
                    }
                }
                
               
                print("data \(String(describing: dataState?.data?.loginResponse?.message))")
            }
            
            self.runSafe(parameter: dataState?.error) {
                print("error \(String(describing: dataState?.error))")
            }
            
        }
        
        
        
    }
    
    
    func runSafe<T>(parameter: T? , callback: ()->Void)  {
        if (parameter != nil){
            callback()
        }
    }
    
    
    
    @IBAction func loginButtonPressed(_ sender: Any) {
        
        self.viewModel.login(request: LoginRequest(password: edPassword.text, user_name: edUsername.text))
        
    }
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        if (textField == self.edUsername){
            self.edPassword.becomeFirstResponder()
        }else {
            self.view.endEditing(true)
        }
        return false
    }
    
    
    @IBAction func forgetPasswordPressed(_ sender: Any) {
        
    }
    
}
