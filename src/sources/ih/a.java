package ih;

import bq.m;
import bq.r;
import com.google.gson.JsonObject;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.http.model.FluentGetLessonSummaryWithIdsResponse;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingodeer.network.model.ApiResponse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rl.h;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdLessonFav f34410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PdLessonFav pdLessonFav, vy.d dVar) {
        super(2, dVar);
        this.f34410b = pdLessonFav;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new a(this.f34410b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f34409a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("IDs", this.f34410b.getLessonId().toString());
            int[] iArr = r.f4959a;
            jsonObject.addProperty("lan", m.c());
            jsonObject.addProperty("appversion", "Android-".concat(m.d()));
            h hVar = h.f49283a;
            this.f34409a = 1;
            obj = hVar.b(jsonObject, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        if (apiResponse instanceof ApiResponse.Error) {
            return ry.r.f50854a;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        List<PdLesson> elements = ((FluentGetLessonSummaryWithIdsResponse) ((ApiResponse.Success) apiResponse).getData()).getElements();
        if (!elements.isEmpty()) {
            PdLessonDbHelper.INSTANCE.pdLessonDao().insertOrReplaceInTx(elements);
        }
        return elements;
    }
}
