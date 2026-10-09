package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38981b;

    public /* synthetic */ g() {
        this.f38980a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        m7.d dVar;
        ArrayDeque arrayDeque;
        int size;
        qp.r[] rVarArr;
        switch (this.f38980a) {
            case 0:
                int i11 = message.what;
                if (i11 == -3 || i11 == -2 || i11 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f38981b).get(), message.what);
                    return;
                } else {
                    if (i11 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                if (qf.a.b(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(message, "message");
                    tf.o oVar = (tf.o) this.f38981b;
                    if (message.what == oVar.f52208t) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            oVar.a(null);
                        } else {
                            oVar.a(data);
                        }
                        try {
                            oVar.f52202a.unbindService(oVar);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                    return;
                }
            case 2:
                m7.e eVar = (m7.e) this.f38981b;
                int i12 = message.what;
                m7.d dVar2 = null;
                if (i12 != 1) {
                    if (i12 == 2) {
                        dVar = (m7.d) message.obj;
                        int i13 = dVar.f40951a;
                        MediaCodec.CryptoInfo cryptoInfo = dVar.f40953c;
                        long j11 = dVar.f40954d;
                        int i14 = dVar.f40955e;
                        try {
                            synchronized (m7.e.f40957h) {
                                eVar.f40958a.queueSecureInputBuffer(i13, 0, cryptoInfo, j11, i14);
                                break;
                            }
                        } catch (RuntimeException e8) {
                            AtomicReference atomicReference = eVar.f40961d;
                            while (!atomicReference.compareAndSet(null, e8) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i12 == 3) {
                        eVar.f40962e.c();
                    } else if (i12 != 4) {
                        AtomicReference atomicReference2 = eVar.f40961d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            eVar.f40958a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference3 = eVar.f40961d;
                            while (!atomicReference3.compareAndSet(null, e10) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (dVar2 != null) {
                        arrayDeque = m7.e.f40956g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(dVar2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                dVar = (m7.d) message.obj;
                try {
                    eVar.f40958a.queueInputBuffer(dVar.f40951a, 0, dVar.f40952b, dVar.f40954d, dVar.f40955e);
                    break;
                } catch (RuntimeException e11) {
                    AtomicReference atomicReference4 = eVar.f40961d;
                    while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                    }
                }
                dVar2 = dVar;
                if (dVar2 != null) {
                    arrayDeque = m7.e.f40956g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(dVar2);
                        return;
                    }
                }
                return;
            case 3:
                if (message.what != 1) {
                    return;
                }
                p9.v vVar = (p9.v) this.f38981b;
                PreferenceScreen preferenceScreen = vVar.f46705b.f46649g;
                if (preferenceScreen != null) {
                    vVar.f46706c.setAdapter(new p9.y(preferenceScreen));
                    preferenceScreen.l();
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                x6.b bVar = (x6.b) this.f38981b;
                while (true) {
                    synchronized (bVar.f55809b) {
                        try {
                            size = bVar.f55811d.size();
                            if (size <= 0) {
                                return;
                            }
                            rVarArr = new qp.r[size];
                            bVar.f55811d.toArray(rVarArr);
                            bVar.f55811d.clear();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        qp.r rVar = rVarArr[i15];
                        int size2 = ((ArrayList) rVar.f48146c).size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            x6.a aVar = (x6.a) ((ArrayList) rVar.f48146c).get(i16);
                            if (!aVar.f55805d) {
                                aVar.f55803b.onReceive(bVar.f55808a, (Intent) rVar.f48145b);
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Looper looper, int i11) {
        super(looper);
        this.f38980a = i11;
        this.f38981b = obj;
    }

    public g(tf.o oVar) {
        this.f38980a = 1;
        this.f38981b = oVar;
    }
}
