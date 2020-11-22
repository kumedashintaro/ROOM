package kumeda.example.room.repository

import androidx.lifecycle.LiveData
import kumeda.example.room.data.UserDao
import kumeda.example.room.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }
}