package rl;

import com.google.gson.JsonObject;
import o20.t0;
import r20.k;
import r20.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    @k({"Accept: application/json"})
    @o("fluent_progress_sync")
    Object a(@r20.a JsonObject jsonObject, vy.d<? super t0<String>> dVar);

    @k({"Accept: application/json"})
    @o("fluent_lessonsummary_withids_get")
    Object b(@r20.a JsonObject jsonObject, vy.d<? super t0<String>> dVar);

    @k({"Accept: application/json"})
    @o("fluent_lessons_get")
    Object c(@r20.a JsonObject jsonObject, vy.d<? super t0<String>> dVar);

    @k({"Accept: application/json"})
    @o("fluent_onelesson_get")
    Object d(@r20.a JsonObject jsonObject, vy.d<? super t0<String>> dVar);

    @k({"Accept: application/json"})
    @o("fluent_lessondetails_withids_get")
    Object e(@r20.a JsonObject jsonObject, vy.d<? super t0<String>> dVar);
}
