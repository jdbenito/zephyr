//
//  Person.swift
//  Meetup
//
//  Created by John Denver Benito on 2018-10-16.
//  Copyright © 2018 Drivewyze Inc. All rights reserved.
//

import Cocoa

class Person: NSObject {
    @objc dynamic var firstName: String
    @objc dynamic var lastName: String
    @objc dynamic var age: Int = 0
    
    init(firstName: String, lastName: String) {
        self.firstName = firstName
        self.lastName = lastName
    }
    
    convenience init(firstName: String, lastName: String, age: Int) {
        self.init(firstName: firstName, lastName: lastName)
        self.age = age
    }
}
