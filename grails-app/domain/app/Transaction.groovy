package app

class Transaction {
    float value
    String description
    Date date
    float runningBalance
    User user

    static belongsTo = {users: User}

    static constraints = {
        value blank: false
        date blank: false
        description blank: false
        runningBalance blank: false

    }
}
