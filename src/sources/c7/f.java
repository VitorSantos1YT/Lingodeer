package c7;

import android.database.sqlite.SQLiteDatabase;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6652b;

    public /* synthetic */ f() {
        this.f6651a = 1;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean z12 = kotlin.jvm.internal.m.h(str.charAt(!z11 ? i11 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                } else {
                    length--;
                }
            } else if (z12) {
                i11++;
            } else {
                z11 = true;
            }
        }
        if (str.subSequence(i11, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public static String c(int i11) {
        return BuildConfig.VERSION_NAME + ((char) ((i11 >> 24) & 255)) + ((char) ((i11 >> 16) & 255)) + ((char) ((i11 >> 8) & 255)) + ((char) (i11 & 255));
    }

    public void a(int i11) {
        this.f6652b = i11 | this.f6652b;
    }

    public boolean e(int i11) {
        return (this.f6652b & i11) == i11;
    }

    public abstract void h(la.b bVar);

    public abstract void k(la.b bVar, int i11, int i12);

    public abstract void l(la.b bVar);

    public abstract void m(la.b bVar, int i11, int i12);

    public String toString() {
        switch (this.f6651a) {
            case 0:
                return c(this.f6652b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(int i11, int i12) {
        this.f6651a = i12;
        this.f6652b = i11;
    }

    public void g(la.b bVar) {
    }
}
