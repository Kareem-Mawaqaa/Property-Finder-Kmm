//
//  LoginViewController.swift
//  flythru-porter
//
//  Created by Kareem Radwan on 7/11/21.
//

import UIKit

class LoginViewController: UIViewController , UITextFieldDelegate {
    
    
    @IBOutlet weak var edPassword: UITextField!
    
    @IBOutlet weak var edUsername: UITextField!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.edPassword.delegate = self
        
        self.edUsername.delegate = self
        // Do any additional setup after loading the view.
    }
    
    
    
    @IBAction func loginButtonPressed(_ sender: Any) {
        let home = MainTabBarController()
        
        let navVC = UINavigationController(rootViewController:home)
        navVC.modalPresentationStyle = .fullScreen
        navVC.isNavigationBarHidden = true
        self.present(navVC, animated: true, completion:nil)
        
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
