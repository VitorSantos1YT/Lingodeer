package ib;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import fb.l;
import java.util.Objects;
import pb.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f34315b;

    public /* synthetic */ g(i iVar, int i11) {
        this.f34314a = i11;
        this.f34315b = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[Catch: all -> 0x0039, TryCatch #5 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004b, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:27:0x0069, B:29:0x0074, B:37:0x0086, B:33:0x007a, B:34:0x007b, B:36:0x0083, B:41:0x008a, B:24:0x0060, B:25:0x0066, B:17:0x004c, B:18:0x0052), top: B:72:0x0015, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: all -> 0x0039, TryCatch #5 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004b, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:27:0x0069, B:29:0x0074, B:37:0x0086, B:33:0x007a, B:34:0x007b, B:36:0x0083, B:41:0x008a, B:24:0x0060, B:25:0x0066, B:17:0x004c, B:18:0x0052), top: B:72:0x0015, inners: #1, #2 }] */
    @Override // java.lang.Runnable
    public final void run() {
        o20.a aVar;
        g gVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f34314a) {
            case 0:
                synchronized (this.f34315b.f34326t) {
                    i iVar = this.f34315b;
                    iVar.H = (Intent) iVar.f34326t.get(0);
                    break;
                }
                Intent intent = this.f34315b.H;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f34315b.H.getIntExtra("KEY_START_ID", 0);
                    l lVarB = l.b();
                    int i11 = i.M;
                    Objects.toString(this.f34315b.H);
                    lVarB.getClass();
                    PowerManager.WakeLock wakeLockA = pb.l.a(this.f34315b.f34320a, action + " (" + intExtra + ")");
                    int i12 = 1;
                    try {
                        try {
                            l lVarB2 = l.b();
                            wakeLockA.toString();
                            lVarB2.getClass();
                            wakeLockA.acquire();
                            i iVar2 = this.f34315b;
                            iVar2.f34325f.a(iVar2.H, intExtra, iVar2);
                            l lVarB3 = l.b();
                            wakeLockA.toString();
                            lVarB3.getClass();
                            wakeLockA.release();
                            i iVar3 = this.f34315b;
                            aVar = iVar3.f34321b.f47697d;
                            gVar = new g(iVar3, i12);
                        } catch (Throwable unused) {
                            l lVarB4 = l.b();
                            int i13 = i.M;
                            lVarB4.getClass();
                            l lVarB5 = l.b();
                            wakeLockA.toString();
                            lVarB5.getClass();
                            wakeLockA.release();
                            i iVar4 = this.f34315b;
                            aVar = iVar4.f34321b.f47697d;
                            gVar = new g(iVar4, i12);
                        }
                        aVar.execute(gVar);
                        return;
                    } catch (Throwable th2) {
                        l lVarB6 = l.b();
                        int i14 = i.M;
                        wakeLockA.toString();
                        lVarB6.getClass();
                        wakeLockA.release();
                        i iVar5 = this.f34315b;
                        iVar5.f34321b.f47697d.execute(new g(iVar5, i12));
                        throw th2;
                    }
                }
                return;
            default:
                i iVar6 = this.f34315b;
                l.b().getClass();
                i.b();
                synchronized (iVar6.f34326t) {
                    try {
                        if (iVar6.H != null) {
                            l lVarB7 = l.b();
                            Objects.toString(iVar6.H);
                            lVarB7.getClass();
                            if (!((Intent) iVar6.f34326t.remove(0)).equals(iVar6.H)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar6.H = null;
                        }
                        j jVar = iVar6.f34321b.f47694a;
                        b bVar = iVar6.f34325f;
                        synchronized (bVar.f34298c) {
                            zIsEmpty = bVar.f34297b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && iVar6.f34326t.isEmpty()) {
                            synchronized (jVar.f46743e) {
                                zIsEmpty2 = jVar.f46741c.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                l.b().getClass();
                                SystemAlarmService systemAlarmService = iVar6.K;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!iVar6.f34326t.isEmpty()) {
                                iVar6.c();
                            }
                        } else if (!iVar6.f34326t.isEmpty()) {
                            iVar6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
