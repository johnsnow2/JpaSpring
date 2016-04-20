package ua.danni.entity;

import javax.persistence.*;

/**
 * Created by Artem on 28.03.2016.
 */
@Entity
@Table(name = "groups", schema = "", catalog = "spring_epam")
public class Groups {
    private int idGroup;
    private User userByIdStudent;

    @Id
    @Column(name = "id_group", nullable = false, insertable = true, updatable = true)
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groups that = (Groups) o;

        if (idGroup != that.idGroup) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idGroup;
    }

    @ManyToOne
    @JoinColumn(name = "id_student", referencedColumnName = "idUser")
    public User getUserByIdStudent() {
        return userByIdStudent;
    }

    public void setUserByIdStudent(User userByIdStudent) {
        this.userByIdStudent = userByIdStudent;
    }
}
