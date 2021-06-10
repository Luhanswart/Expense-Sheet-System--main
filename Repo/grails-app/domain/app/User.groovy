package app

import app.Transaction

class User {
    String name
    String surname
    float balance
    String username

    static hasMany = {
        transactions:
        Transaction
    }

    static constraints = {
        name blank: false, unique: true
        surname blank: false
        balance blank: false
        username blank: false
    }
}
