package com.lingodeer.data.env;

import a.ar.MFeWs;
import android.content.Context;
import android.content.SharedPreferences;
import com.yalantis.ucrop.view.CropImageView;
import e00.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfPersistUtil {
    private final Context context;

    public ConfPersistUtil(Context context) {
        m.f(context, "context");
        this.context = context;
    }

    private final void write(String str, Object obj, SharedPreferences.Editor editor) {
        if (obj == null) {
            editor.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Number) obj).floatValue());
        }
    }

    public final void readEntries(Env env) {
        m.f(env, "env");
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(Env.CONF_NAME, 0);
        i iVarA = l.a(env.getClass().getFields());
        while (iVarA.hasNext()) {
            Field field = (Field) iVarA.next();
            int modifiers = field.getModifiers();
            if (!Modifier.isFinal(modifiers) && !Modifier.isStatic(modifiers) && sharedPreferences.contains(field.getName())) {
                Class<?> type = field.getType();
                Class cls = Boolean.TYPE;
                if (m.a(type, cls) || m.a(field.getType(), cls)) {
                    try {
                        field.set(env, Boolean.valueOf(sharedPreferences.getBoolean(field.getName(), false)));
                    } catch (IllegalAccessException e8) {
                        e8.printStackTrace();
                    }
                } else if (m.a(field.getType(), String.class)) {
                    try {
                        field.set(env, sharedPreferences.getString(field.getName(), null));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    Class<?> type2 = field.getType();
                    Class cls2 = Integer.TYPE;
                    if (m.a(type2, cls2) || m.a(field.getType(), cls2)) {
                        try {
                            field.set(env, Integer.valueOf(sharedPreferences.getInt(field.getName(), 0)));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                field.set(env, Integer.valueOf((int) sharedPreferences.getLong(field.getName(), 0L)));
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                    } else {
                        Class<?> type3 = field.getType();
                        Class cls3 = Long.TYPE;
                        if (m.a(type3, cls3) || m.a(field.getType(), cls3)) {
                            try {
                                field.set(env, Long.valueOf(sharedPreferences.getLong(field.getName(), 0L)));
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                try {
                                    field.set(env, Long.valueOf(sharedPreferences.getInt(field.getName(), 0)));
                                } catch (Exception e14) {
                                    e14.printStackTrace();
                                }
                            }
                        } else {
                            Class<?> type4 = field.getType();
                            Class cls4 = Float.TYPE;
                            if (m.a(type4, cls4) || m.a(field.getType(), cls4)) {
                                try {
                                    field.set(env, Float.valueOf(sharedPreferences.getFloat(field.getName(), CropImageView.DEFAULT_ASPECT_RATIO)));
                                } catch (IllegalAccessException e15) {
                                    e15.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void updateEntries(String[] strArr, Object obj) {
        m.f(strArr, MFeWs.OfaSyWv);
        m.f(obj, "obj");
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(Env.CONF_NAME, 0).edit();
        Class<?> cls = obj.getClass();
        try {
            for (String str : strArr) {
                try {
                    Object obj2 = cls.getField(str).get(obj);
                    m.c(editorEdit);
                    write(str, obj2, editorEdit);
                } catch (IllegalAccessException unused) {
                    throw new IllegalArgumentException();
                } catch (NoSuchFieldException unused2) {
                    throw new IllegalArgumentException();
                }
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            editorEdit.apply();
            throw th2;
        }
    }

    public final void updateEntry(Env env, String fieldName) {
        m.f(env, "env");
        m.f(fieldName, "fieldName");
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(Env.CONF_NAME, 0).edit();
        try {
            Object obj = env.getClass().getField(fieldName).get(env);
            m.e(obj, "get(...)");
            try {
                m.c(editorEdit);
                write(fieldName, obj, editorEdit);
            } finally {
                editorEdit.apply();
            }
        } catch (Exception unused) {
        }
    }

    public final void updateEntry(Class<?> confClz, String fieldName, Object obj) {
        m.f(confClz, "confClz");
        m.f(fieldName, "fieldName");
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(Env.CONF_NAME, 0).edit();
        try {
            confClz.getField(fieldName);
            try {
                m.c(editorEdit);
                write(fieldName, obj, editorEdit);
            } finally {
                editorEdit.apply();
            }
        } catch (NoSuchFieldException unused) {
            throw new IllegalArgumentException();
        }
    }

    public final void updateEntries(Class<?> confClz, String[] fieldNames, Object[] values) {
        m.f(confClz, "confClz");
        m.f(fieldNames, "fieldNames");
        m.f(values, "values");
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(Env.CONF_NAME, 0).edit();
        try {
            int length = fieldNames.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = fieldNames[i11];
                Object obj = values[i11];
                try {
                    confClz.getField(str);
                    m.c(editorEdit);
                    write(str, obj, editorEdit);
                } catch (NoSuchFieldException unused) {
                    throw new IllegalArgumentException();
                }
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            editorEdit.apply();
            throw th2;
        }
    }
}
