//
//  ViewController.swift
//  Meetup
//
//  Created by John Denver Benito on 2018-10-16.
//  Copyright © 2018 Drivewyze Inc. All rights reserved.
//

import Cocoa

class ViewController: NSViewController {
    
    @objc dynamic var currentPerson: Person?
    @objc dynamic var peopleList: [Person]?
    
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
        currentPerson = Person(firstName: "John", lastName: "Doe")
        
        peopleList = ([currentPerson,
                       Person(firstName: "Foo", lastName: "Bar", age: 100),
                       Person(firstName: "John", lastName: "Snow", age: 50)] as! [Person])
    }
    
    @objc dynamic let ageAtLeast50 = NSPredicate(format: "age >= 50")
}

