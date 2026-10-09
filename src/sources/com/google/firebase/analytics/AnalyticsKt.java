package com.google.firebase.analytics;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f17761b = new Object();

    public static final FirebaseAnalytics a(Firebase firebase) {
        m.f(firebase, "<this>");
        if (f17760a == null) {
            synchronized (f17761b) {
                if (f17760a == null) {
                    m.f(Firebase.f17711a, "<this>");
                    FirebaseApp firebaseAppE = FirebaseApp.e();
                    firebaseAppE.b();
                    f17760a = FirebaseAnalytics.getInstance(firebaseAppE.f17714a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f17760a;
        m.c(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
