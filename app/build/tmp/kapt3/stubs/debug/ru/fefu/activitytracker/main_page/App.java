package ru.fefu.activitytracker.main_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lru/fefu/activitytracker/main_page/App;", "Landroid/app/Application;", "()V", "db", "Lru/fefu/activitytracker/main_page/room/ActivityDataBase;", "getDb", "()Lru/fefu/activitytracker/main_page/room/ActivityDataBase;", "db$delegate", "Lkotlin/Lazy;", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final ru.fefu.activitytracker.main_page.App.Companion Companion = null;
    public static ru.fefu.activitytracker.main_page.App INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy db$delegate = null;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.fefu.activitytracker.main_page.room.ActivityDataBase getDb() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lru/fefu/activitytracker/main_page/App$Companion;", "", "()V", "INSTANCE", "Lru/fefu/activitytracker/main_page/App;", "getINSTANCE", "()Lru/fefu/activitytracker/main_page/App;", "setINSTANCE", "(Lru/fefu/activitytracker/main_page/App;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.fefu.activitytracker.main_page.App getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        ru.fefu.activitytracker.main_page.App p0) {
        }
    }
}