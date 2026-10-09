package q20;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import m00.h;
import m00.i;
import o20.m;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f47414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f47415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f47416b;

    static {
        MediaType.f45062e.getClass();
        f47414c = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public b(Gson gson, TypeAdapter typeAdapter) {
        this.f47415a = gson;
        this.f47416b = typeAdapter;
    }

    @Override // o20.m
    public final Object j(Object obj) throws IOException {
        i iVar = new i();
        JsonWriter jsonWriterNewJsonWriter = this.f47415a.newJsonWriter(new OutputStreamWriter(new h(iVar, 0), StandardCharsets.UTF_8));
        this.f47416b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(f47414c, iVar.z(iVar.f40718b));
    }
}
