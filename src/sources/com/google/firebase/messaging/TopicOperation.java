package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class TopicOperation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f20533d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20536c;

    public TopicOperation(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !f20533d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(ep.a.g("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f20534a = strSubstring;
        this.f20535b = str;
        this.f20536c = ep.a.D(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.f20534a.equals(topicOperation.f20534a) && this.f20535b.equals(topicOperation.f20535b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20535b, this.f20534a});
    }
}
