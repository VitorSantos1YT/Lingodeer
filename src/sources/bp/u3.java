package bp;

import android.content.Context;
import android.os.Looper;
import com.lingo.lingoskill.http.object.NewsFeed;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements tx.d, kc.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4841b;

    public /* synthetic */ u3(boolean z11, int i11) {
        this.f4840a = i11;
        this.f4841b = z11;
    }

    @Override // kc.j
    public boolean a(hc.g gVar) {
        return this.f4841b;
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        if (!this.f4841b) {
            return it;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : it) {
            if (kotlin.jvm.internal.m.a(((NewsFeed) obj2).getMemberVisible(), "1")) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // kc.j
    public boolean b() {
        return this.f4841b;
    }

    public void c(boolean z11) {
        switch (this.f4840a) {
            case 2:
                if (this.f4841b != z11) {
                    this.f4841b = z11;
                    break;
                }
                break;
            default:
                if (this.f4841b != z11) {
                    this.f4841b = z11;
                    break;
                }
                break;
        }
    }

    public u3(Context context, Looper looper, b7.y yVar, int i11) {
        this.f4840a = i11;
        switch (i11) {
            case 3:
                new ay.k0(context.getApplicationContext());
                yVar.a(looper, null);
                break;
            default:
                new tw.c(context.getApplicationContext(), 9);
                yVar.a(looper, null);
                break;
        }
    }

    public u3(ve.i iVar, c7.s sVar) throws c7.r {
        this.f4840a = 1;
        int i11 = sVar.f6713a;
        ByteBuffer byteBuffer = sVar.f6714b;
        b7.a.d(i11 == 6 || i11 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        b7.v vVar = new b7.v(bArr, iMin);
        iVar.getClass();
        if (vVar.h()) {
            this.f4841b = false;
            return;
        }
        int i12 = vVar.i(2);
        if (!vVar.h()) {
            this.f4841b = true;
            return;
        }
        if (i12 != 3 && i12 != 0) {
            vVar.h();
        }
        vVar.s();
        throw new c7.r();
    }
}
