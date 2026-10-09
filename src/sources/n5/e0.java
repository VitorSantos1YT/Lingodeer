package n5;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, xy.c cVar) {
        d0 d0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i11 = d0Var.f43265e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d0Var.f43265e = i11 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object obj2 = d0Var.f43263c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = d0Var.f43265e;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            if (this.f43425c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f43423a);
            try {
                s0 s0Var = this.f43424b;
                m00.h hVar = new m00.h(fileOutputStream3);
                d0Var.f43261a = fileOutputStream3;
                d0Var.f43262b = fileOutputStream3;
                d0Var.f43265e = 1;
                s0Var.c(obj, hVar);
                if (b0Var == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = d0Var.f43262b;
            fileOutputStream = d0Var.f43261a;
            try {
                com.bumptech.glide.e.F(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ns.o.m(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        ns.o.m(fileOutputStream, null);
        return b0Var;
    }
}
