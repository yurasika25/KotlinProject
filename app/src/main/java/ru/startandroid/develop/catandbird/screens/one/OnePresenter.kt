package ru.startandroid.develop.catandbird.screens.one

import ru.startandroid.develop.catandbird.mvp.BasicPresenter

class OnePresenter : BasicPresenter<OneView?>() {
    fun onLoginButtonClicked(login: String, password: String) {
        if (login == "hello" && password == "world") {
            getView()?.onNavigateToTwo()
        } else {
            getView()?.onCredentialsWrong()
        }
    }
}


//        if(password.length()>3) {
//            getView().onNavigateToTwo();
//        }
//        else
//        {
//            getView().onCredentialsError();
//        }
//    }

