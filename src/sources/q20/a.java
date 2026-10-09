package q20;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o20.l;
import o20.m;
import o20.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f47413a;

    public a(Gson gson) {
        this.f47413a = gson;
    }

    @Override // o20.l
    public final m a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f47413a;
        return new b(gson, gson.getAdapter(typeToken));
    }

    @Override // o20.l
    public final m b(Type type, Annotation[] annotationArr, v0 v0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f47413a;
        return new ob.l(26, gson, gson.getAdapter(typeToken));
    }
}
