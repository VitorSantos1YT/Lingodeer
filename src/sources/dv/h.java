package dv;

import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface h {
    @r20.k({"Accept: application/json"})
    @r20.o("character_ocr")
    Object a(@r20.i("token") String str, @r20.a RequestBody requestBody, vy.d<? super o20.t0<String>> dVar);

    @r20.k({"Accept: application/json"})
    @r20.o("speech_assessment")
    Object b(@r20.i("token") String str, @r20.a RequestBody requestBody, vy.d<? super o20.t0<String>> dVar);
}
