package com.qiwenge.android.entity.base;

import com.j256.ormlite.field.DatabaseField;

public class BaseModel {

    public static final String ID = "id";

    @DatabaseField
    private String id;

    private Id _id;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public String getId() {
        if (id == null)
            setId(_id.get$id());
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
