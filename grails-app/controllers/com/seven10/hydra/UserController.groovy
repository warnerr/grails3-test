package com.seven10.hydra

import grails.converters.JSON

class UserController {

    def userService
    def index() { }

    def list() {
        render userService.getUsers() as JSON
    }

    def create() {
        def user = request.JSON
        def newUser = userService.addUser(user)
        render newUser as JSON
    }

    def show() {
        def id = params.id
        def user =  userService.getUser(id)
        render user as JSON
    }

    def delete() {
        def id = params.id
        render userService.deleteUser(id) as JSON
    }

    def update() {
        def id = params.id
        def user = request.JSON
        render userService.updateUser(id, user) as JSON
    }
}
