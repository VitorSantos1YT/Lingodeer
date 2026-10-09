package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class TrieParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Joiner f21444a = new Joiner(BuildConfig.VERSION_NAME);

    public static int a(ArrayDeque arrayDeque, String str, int i11, ImmutableMap.Builder builder) {
        int length = str.length();
        char cCharAt = 0;
        int i12 = i11;
        while (i12 < length && (cCharAt = str.charAt(i12)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i12++;
        }
        arrayDeque.push(new StringBuilder(str.subSequence(i11, i12)).reverse());
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strC = f21444a.c(arrayDeque);
            if (strC.length() > 0) {
                builder.c(strC, PublicSuffixType.a(cCharAt));
            }
        }
        int iA = i12 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(arrayDeque, str, iA, builder);
                if (str.charAt(iA) == '?' || str.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        arrayDeque.pop();
        return iA - i11;
    }

    public static void b(CharSequence... charSequenceArr) {
        Joiner joiner = f21444a;
        joiner.getClass();
        String strC = joiner.c(Arrays.asList(charSequenceArr));
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        int length = strC.length();
        for (int iA = 0; iA < length; iA += a(new ArrayDeque(), strC, iA, builder)) {
        }
        builder.a(true);
    }
}
