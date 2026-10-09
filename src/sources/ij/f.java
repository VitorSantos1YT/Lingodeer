package ij;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import cf.x;
import com.adjust.sdk.Constants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.MultiLanMapField;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import ns.o;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34430a;

    public f(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f34430a = true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    public static boolean b() {
        long j11;
        try {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            LevelDao levelDaoQ = dVar.q();
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            int i11 = x.n().keyLanguage;
            if (i11 != 22 && i11 != 40 && i11 != 48 && i11 != 54 && i11 != 55) {
                switch (i11) {
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        j11 = 2;
                        break;
                    default:
                        j11 = 1;
                        break;
                }
            } else {
                j11 = 2;
            }
            return ((Level) levelDaoQ.load(Long.valueOf(j11))) != null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static jj.a c() {
        se.i.x().B(false);
        jj.a aVar = (jj.a) se.i.x().f34422c;
        aVar.getClass();
        try {
            aVar.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        aVar.f36402a.getApplicationContext().deleteDatabase(aVar.d());
        aVar.d();
        se.i.x().B(true);
        return (jj.a) se.i.x().f34422c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6 A[Catch: IOException -> 0x0102, TryCatch #1 {IOException -> 0x0102, blocks: (B:41:0x00ea, B:43:0x00f6, B:46:0x0104), top: B:103:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0104 A[Catch: IOException -> 0x0102, TRY_LEAVE, TryCatch #1 {IOException -> 0x0102, blocks: (B:41:0x00ea, B:43:0x00f6, B:46:0x0104), top: B:103:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172 A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #4 {, blocks: (B:76:0x016e, B:78:0x0172), top: B:109:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x0193  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d7, code lost:
    
        if (r5.a(r0, r2) == r3) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xy.c r20) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.f.a(xy.c):java.lang.Object");
    }

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public abstract int g();

    public final void h(boolean z11) throws IOException {
        System.currentTimeMillis();
        File fileCreateTempFile = File.createTempFile("uncompress", ".text");
        e();
        q qVar = fv.b.f28186a;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(defpackage.e.m(fv.b.m(), e())));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCreateTempFile));
        try {
            try {
                hz.b.u(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    System.currentTimeMillis();
                    i(fileInputStream, z11);
                } finally {
                    fileCreateTempFile.delete();
                }
            } catch (IOException e8) {
                fileCreateTempFile.delete();
                throw e8;
            }
        } catch (Throwable th2) {
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            bufferedInputStream.close();
            throw th2;
        }
    }

    public abstract void j(int i11);

    public final void i(FileInputStream fileInputStream, boolean z11) throws IOException {
        jj.a aVarC;
        System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Constants.ENCODING));
        JsonParser jsonParser = new JsonParser();
        try {
            if (z11) {
                aVarC = c();
            } else {
                if (d.f34419e == null) {
                    synchronized (d.class) {
                        if (d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            d.f34419e = new d(lingoSkillApplication);
                        }
                    }
                }
                d dVar = d.f34419e;
                kotlin.jvm.internal.m.c(dVar);
                aVarC = (jj.a) dVar.f34422c;
            }
            SQLiteDatabase writableDatabase = aVarC.getWritableDatabase();
            List<MultiLanMapField> listCreateItems = MultiLanMapField.Companion.createItems();
            SparseArray sparseArray = new SparseArray();
            for (MultiLanMapField multiLanMapField : listCreateItems) {
                sparseArray.append(multiLanMapField.getLanSig(), writableDatabase.compileStatement("update " + multiLanMapField.getTableName() + bjXGJ.WzNdevCOi + multiLanMapField.getFieldName() + "=? where " + multiLanMapField.getTableKeyName() + "=?"));
            }
            writableDatabase.execSQL("UPDATE Word SET Explanation=null");
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{57, 3}, Integer.valueOf(x.n().keyLanguage))) {
                writableDatabase.execSQL("UPDATE Unit SET Description=null");
            }
            writableDatabase.beginTransaction();
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    JsonObject asJsonObject = jsonParser.parse(line).getAsJsonObject();
                    int asInt = asJsonObject.get("Id").getAsInt();
                    String asString = BuildConfig.VERSION_NAME;
                    if (asJsonObject.has("Value")) {
                        asString = asJsonObject.get("Value").getAsString();
                        kotlin.jvm.internal.m.e(asString, "getAsString(...)");
                    }
                    int i11 = asInt / 100000;
                    int i12 = asInt % 100000;
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) sparseArray.get(i11);
                    if (sQLiteStatement != null) {
                        sQLiteStatement.bindString(1, asString);
                        sQLiteStatement.bindLong(2, i12);
                        sQLiteStatement.execute();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                j(x.n().locateLanguage);
                bufferedReader.close();
                System.currentTimeMillis();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                o.m(bufferedReader, th3);
                throw th4;
            }
        }
    }
}
