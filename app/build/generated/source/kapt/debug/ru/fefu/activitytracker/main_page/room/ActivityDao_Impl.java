package ru.fefu.activitytracker.main_page.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ActivityDao_Impl implements ActivityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ActivityRoom> __insertionAdapterOfActivityRoom;

  private final Converter __converter = new Converter();

  private final EntityDeletionOrUpdateAdapter<ActivityRoom> __deletionAdapterOfActivityRoom;

  public ActivityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfActivityRoom = new EntityInsertionAdapter<ActivityRoom>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ActivityRoom` (`id`,`activity_type`,`start_time`,`end_time`,`coordinates`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActivityRoom value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getType());
        stmt.bindLong(3, value.getStartTime());
        stmt.bindLong(4, value.getEndTime());
        final String _tmp;
        _tmp = __converter.fromList(value.getCoordinates());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfActivityRoom = new EntityDeletionOrUpdateAdapter<ActivityRoom>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ActivityRoom` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActivityRoom value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final ActivityRoom activity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfActivityRoom.insert(activity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ActivityRoom activity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfActivityRoom.handle(activity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ActivityRoom>> getAll() {
    final String _sql = "SELECT * FROM ActivityRoom ORDER BY end_time DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ActivityRoom"}, false, new Callable<List<ActivityRoom>>() {
      @Override
      public List<ActivityRoom> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_type");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
          final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinates");
          final List<ActivityRoom> _result = new ArrayList<ActivityRoom>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ActivityRoom _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final long _tmpStartTime;
            _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
            final long _tmpEndTime;
            _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
            final List<Pair<Double, Double>> _tmpCoordinates;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfCoordinates)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfCoordinates);
            }
            _tmpCoordinates = __converter.toList(_tmp);
            _item = new ActivityRoom(_tmpId,_tmpType,_tmpStartTime,_tmpEndTime,_tmpCoordinates);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public ActivityRoom getById(final int id) {
    final String _sql = "SELECT * FROM ActivityRoom WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "activity_type");
      final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "start_time");
      final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "end_time");
      final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinates");
      final ActivityRoom _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final long _tmpStartTime;
        _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
        final long _tmpEndTime;
        _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
        final List<Pair<Double, Double>> _tmpCoordinates;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfCoordinates)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfCoordinates);
        }
        _tmpCoordinates = __converter.toList(_tmp);
        _result = new ActivityRoom(_tmpId,_tmpType,_tmpStartTime,_tmpEndTime,_tmpCoordinates);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
