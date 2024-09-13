/*
 * This file is generated by jOOQ.
 */
package com.nrapendra.jooq.tables.records;


import com.nrapendra.jooq.tables.UserPreferences;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPreferencesRecord extends UpdatableRecordImpl<UserPreferencesRecord> implements Record5<Long, String, String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_preferences.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_preferences.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user_preferences.theme</code>.
     */
    public void setTheme(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_preferences.theme</code>.
     */
    public String getTheme() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user_preferences.language</code>.
     */
    public void setLanguage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_preferences.language</code>.
     */
    public String getLanguage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user_preferences.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user_preferences.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.user_preferences.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user_preferences.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserPreferences.USER_PREFERENCES.ID;
    }

    @Override
    public Field<String> field2() {
        return UserPreferences.USER_PREFERENCES.THEME;
    }

    @Override
    public Field<String> field3() {
        return UserPreferences.USER_PREFERENCES.LANGUAGE;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return UserPreferences.USER_PREFERENCES.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return UserPreferences.USER_PREFERENCES.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTheme();
    }

    @Override
    public String component3() {
        return getLanguage();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component5() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTheme();
    }

    @Override
    public String value3() {
        return getLanguage();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value5() {
        return getUpdatedAt();
    }

    @Override
    public UserPreferencesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UserPreferencesRecord value2(String value) {
        setTheme(value);
        return this;
    }

    @Override
    public UserPreferencesRecord value3(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public UserPreferencesRecord value4(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UserPreferencesRecord value5(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public UserPreferencesRecord values(Long value1, String value2, String value3, OffsetDateTime value4, OffsetDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPreferencesRecord
     */
    public UserPreferencesRecord() {
        super(UserPreferences.USER_PREFERENCES);
    }

    /**
     * Create a detached, initialised UserPreferencesRecord
     */
    public UserPreferencesRecord(Long id, String theme, String language, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        super(UserPreferences.USER_PREFERENCES);

        setId(id);
        setTheme(theme);
        setLanguage(language);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        resetChangedOnNotNull();
    }
}
