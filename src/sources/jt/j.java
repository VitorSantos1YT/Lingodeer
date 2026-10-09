package jt;

import android.content.Context;
import android.widget.Toast;
import com.lingodeer.data.model.RecognizeErrorType;
import com.lingodeer.data.model.RecordingStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.i implements fz.e {
    public final /* synthetic */ Context H;
    public final /* synthetic */ g K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av.i f36983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f36984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f36986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36987f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f36988t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(av.i iVar, File file, String str, boolean z11, String str2, List list, Context context, g gVar, vy.d dVar) {
        super(2, dVar);
        this.f36983b = iVar;
        this.f36984c = file;
        this.f36985d = str;
        this.f36986e = z11;
        this.f36987f = str2;
        this.f36988t = list;
        this.H = context;
        this.K = gVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j(this.f36983b, this.f36984c, this.f36985d, this.f36986e, this.f36987f, this.f36988t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        j jVar;
        g gVar = this.K;
        l1.b1 b1Var = gVar.f36941j;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36982a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            String str = this.f36986e ? BuildConfig.VERSION_NAME : this.f36987f;
            this.f36982a = 1;
            jVar = this;
            obj = this.f36983b.e(this.f36984c, this.f36985d, str, this.f36988t, jVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            jVar = this;
        }
        av.j jVar2 = (av.j) obj;
        if (oz.q.K0(jVar.f36985d)) {
            Toast.makeText(jVar.H, "refText is Empty!", 1).show();
        }
        if (jVar2 != null) {
            ArrayList arrayList = jVar2.f3160b;
            if (arrayList.isEmpty()) {
                b1Var.setValue(new RecordingStatus.RecognizeError("识别结果为空", RecognizeErrorType.AUDIO_QUALITY_ERROR));
            } else {
                b1Var.setValue(new RecordingStatus.RecognizeSuccess(jVar2.f3159a, arrayList));
            }
            gVar.f36943l.setValue(jVar2.f3161c);
        } else {
            b1Var.setValue(new RecordingStatus.RecognizeError("语音识别失败", RecognizeErrorType.API_ERROR));
        }
        return qy.b0.f48488a;
    }
}
