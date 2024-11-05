package  kotlin_members;

// Studi kasus Register User dengan memanfaatkan sealed class

sealed interface ValidateAuth;

//data class LoginRequest(val username : String, val password : String) : ValidateAuth
data class RegisRequest(val fullName : String?, val username: String?, val password: String?, val email : String?) : ValidateAuth

sealed class ResponseAuth {
    class SuccesRegister(val message: String) : ResponseAuth() {
        override fun toString(): String {
            return message;
        }
    };
    class FailedRegister(val message : String) : ResponseAuth() {
        override fun toString(): String {
            return message;
        }
    }

}

fun isSuccesRegister(username: String?, password: String?, fullName: String?, email: String?) : Boolean {
    return !fullName.isNullOrEmpty() && !password.isNullOrEmpty() && !username.isNullOrEmpty() && !email.isNullOrEmpty();
}

fun handleRequest(request: ValidateAuth) : ResponseAuth {
    return when(request) {
        is RegisRequest -> {
            if (isSuccesRegister(request.fullName, request.username, request.email, request.password)) {
                ResponseAuth.SuccesRegister("Succes Register")
            } else {
                ResponseAuth.FailedRegister("Cannot register")
            }
        }
    }
}

fun main() {
    val user1 = RegisRequest("Jogn Doe", "joen", "123", "jogn@gmail.com")
    val user2 = RegisRequest(null, "Anonimus", "443", "anonimus@gmail.com")
    val user1ResponseAuth = handleRequest(user1)
    val user2ResponseAuth = handleRequest(user2)
    println(user1ResponseAuth)
    println(user2ResponseAuth)
}