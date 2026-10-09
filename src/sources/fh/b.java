package fh;

import bq.m;
import bq.r;
import com.google.gson.JsonObject;
import com.lingo.lingoskill.http.model.FluentGetLessonSummaryWithIdsResponse;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.network.model.ApiResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rl.h;
import rz.b0;
import rz.e0;
import rz.o0;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27281f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f27282t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, int i11, int i12, e eVar, vy.d dVar) {
        super(2, dVar);
        this.f27278c = str;
        this.f27279d = str2;
        this.f27280e = i11;
        this.f27281f = i12;
        this.f27282t = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new b(this.f27278c, this.f27279d, this.f27280e, this.f27281f, this.f27282t, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List<PdLesson> elements;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27277b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("category", this.f27278c);
            int[] iArr = r.f4959a;
            jsonObject.addProperty("lan", m.c());
            jsonObject.addProperty("difficuty", this.f27279d);
            jsonObject.addProperty("pageindex", new Integer(this.f27280e));
            jsonObject.addProperty("pagesize", new Integer(this.f27281f));
            jsonObject.addProperty("appversion", "Android-".concat(m.d()));
            h hVar = h.f49283a;
            this.f27277b = 1;
            obj = hVar.c(jsonObject, this);
            if (obj != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.f27276a;
            com.bumptech.glide.e.F(obj);
            return list;
        }
        com.bumptech.glide.e.F(obj);
        ApiResponse apiResponse = (ApiResponse) obj;
        if (apiResponse instanceof ApiResponse.Error) {
            elements = ry.r.f50854a;
        } else {
            if (!(apiResponse instanceof ApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            elements = ((FluentGetLessonSummaryWithIdsResponse) ((ApiResponse.Success) apiResponse).getData()).getElements();
        }
        this.f27276a = elements;
        this.f27277b = 2;
        f fVar = o0.f50940a;
        Object objM = e0.M(yz.e.f58387a, new gh.d(elements, null, 0), this);
        if (objM != aVar) {
            objM = qy.b0.f48488a;
        }
        return objM == aVar ? aVar : elements;
    }
}
