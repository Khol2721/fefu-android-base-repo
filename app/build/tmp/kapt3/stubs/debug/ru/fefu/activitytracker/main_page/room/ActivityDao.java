package ru.fefu.activitytracker.main_page.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lru/fefu/activitytracker/main_page/room/ActivityDao;", "", "delete", "", "activity", "Lru/fefu/activitytracker/main_page/room/ActivityRoom;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getById", "id", "", "insert", "app_debug"})
public abstract interface ActivityDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ActivityRoom ORDER BY end_time DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<ru.fefu.activitytracker.main_page.room.ActivityRoom>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ActivityRoom WHERE id = :id")
    public abstract ru.fefu.activitytracker.main_page.room.ActivityRoom getById(int id);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    ru.fefu.activitytracker.main_page.room.ActivityRoom activity);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    ru.fefu.activitytracker.main_page.room.ActivityRoom activity);
}