package com.company.exercise_theme_5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
