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
public final class d extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f27291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f27291c = eVar;
        this.f27292d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new d(this.f27291c, this.f27292d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List<PdLesson> elements;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27290b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("IDs", this.f27292d);
            int[] iArr = r.f4959a;
            jsonObject.addProperty("lan", m.c());
            jsonObject.addProperty("appversion", "Android-".concat(m.d()));
            h hVar = h.f49283a;
            this.f27290b = 1;
            obj = hVar.b(jsonObject, this);
            if (obj != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.f27289a;
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
        this.f27289a = elements;
        this.f27290b = 2;
        f fVar = o0.f50940a;
        Object objM = e0.M(yz.e.f58387a, new gh.d(elements, null, 0), this);
        if (objM != aVar) {
            objM = qy.b0.f48488a;
        }
        return objM == aVar ? aVar : elements;
    }
}
