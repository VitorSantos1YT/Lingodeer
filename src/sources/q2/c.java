package q2;

import android.view.KeyEvent;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i11) {
        long j11 = (((long) i11) << 32) | (((long) 0) & 4294967295L);
        int i12 = a.f47409p;
        return j11;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final r d(fz.c cVar) {
        return new d(cVar, null);
    }

    public static final r e(r rVar, fz.c cVar) {
        return rVar.i(new d(null, cVar));
    }
}
