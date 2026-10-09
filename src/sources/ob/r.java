package ob;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import cf.x;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9.u f44873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f44874b;

    public r(s sVar, w9.u uVar) {
        this.f44874b = sVar;
        this.f44873a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        Cursor cursorF = x.F((WorkDatabase_Impl) this.f44874b.f44875a, this.f44873a, false);
        try {
            if (cursorF.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorF.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            return boolValueOf;
        } finally {
            cursorF.close();
        }
    }

    public final void finalize() {
        this.f44873a.release();
    }
}
