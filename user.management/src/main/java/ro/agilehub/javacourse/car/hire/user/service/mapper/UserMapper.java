package ro.agilehub.javacourse.car.hire.user.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ro.agilehub.javacourse.car.hire.user.entity.Country;
import ro.agilehub.javacourse.car.hire.user.entity.User;
import ro.agilehub.javacourse.car.hire.user.userDomain.UserDomain;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ObjectIdMapper.class})
public interface UserMapper {


    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "country", source = "country")
    UserDomain toDomain(User user, Country country);

    @Mapping(target = "id", source = "userDomain.id")
    @Mapping(target = "userName", source = "userDomain.userName")
    @Mapping(target = "country", source = "country")
    User toUser(UserDomain userDomain, Country country);

    @Named("returnUserDomain")
    default UserDomain returnUserDomain(User user){
        var getAllUsers = new UserDomain();
        getAllUsers.setId(getAllUsers.getId());
        getAllUsers.setUserName(getAllUsers.getUserName());
        getAllUsers.setCountry(getAllUsers.getCountry());
        return getAllUsers;
    }
}