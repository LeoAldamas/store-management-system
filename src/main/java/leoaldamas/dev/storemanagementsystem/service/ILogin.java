package leoaldamas.dev.storemanagementsystem.service;

import leoaldamas.dev.storemanagementsystem.model.User;

public interface ILogin {
    User validate(User u, String type);
}
