package com.driveywyze.jdbenito.databindingbasics

class MainActivityPresenter {
    interface View {
        fun onUpdate()
    }

    private var view: View? = null

    fun register(view: View) {
        this.view = view
    }

    fun unregister() {
        this.view = null
    }

    fun didClickUpdate() {
        view?.onUpdate()
    }
}