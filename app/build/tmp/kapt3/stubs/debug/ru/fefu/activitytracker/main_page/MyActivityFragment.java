package ru.fefu.activitytracker.main_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lru/fefu/activitytracker/main_page/MyActivityFragment;", "Lru/fefu/activitytracker/main_page/BaseFragment;", "Lru/fefu/activitytracker/databinding/ActivityMyFragmentBinding;", "()V", "adapterItems", "Lru/fefu/activitytracker/main_page/adapters/ItemAdapter;", "listRepository", "", "Lru/fefu/activitytracker/main_page/lists/ListItem;", "listRepositoryDate", "map", "", "", "", "getMap", "()Ljava/util/Map;", "fillDate", "", "activities", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class MyActivityFragment extends ru.fefu.activitytracker.main_page.BaseFragment<ru.fefu.activitytracker.databinding.ActivityMyFragmentBinding> {
    private final java.util.List<ru.fefu.activitytracker.main_page.lists.ListItem> listRepository = null;
    private final java.util.List<ru.fefu.activitytracker.main_page.lists.ListItem> listRepositoryDate = null;
    private final ru.fefu.activitytracker.main_page.adapters.ItemAdapter adapterItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, java.lang.String> map = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.fefu.activitytracker.main_page.MyActivityFragment.Companion Companion = null;
    
    public MyActivityFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.lang.String> getMap() {
        return null;
    }
    
    private final void fillDate(java.util.List<? extends ru.fefu.activitytracker.main_page.lists.ListItem> activities) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lru/fefu/activitytracker/main_page/MyActivityFragment$Companion;", "", "()V", "getActivityType", "", "number", "", "getNoun", "", "one", "two", "five", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNoun(long number, @org.jetbrains.annotations.NotNull()
        java.lang.String one, @org.jetbrains.annotations.NotNull()
        java.lang.String two, @org.jetbrains.annotations.NotNull()
        java.lang.String five) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActivityType(int number) {
            return null;
        }
    }
}