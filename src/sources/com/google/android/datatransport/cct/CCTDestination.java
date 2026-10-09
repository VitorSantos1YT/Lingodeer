package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CCTDestination implements EncodedDestination {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f7806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CCTDestination f7807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CCTDestination f7808f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7810b;

    static {
        String strA = StringMerger.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f7805c = strA;
        String strA2 = StringMerger.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = StringMerger.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f7806d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding("proto"), new Encoding("json"))));
        f7807e = new CCTDestination(strA, null);
        f7808f = new CCTDestination(strA2, strA3);
    }

    public CCTDestination(String str, String str2) {
        this.f7809a = str;
        this.f7810b = str2;
    }

    public static CCTDestination b(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public final Set a() {
        return f7806d;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public final byte[] getExtras() {
        String str = this.f7809a;
        String str2 = this.f7810b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return e.n("1$", str, "\\", str2).getBytes(Charset.forName(Constants.ENCODING));
    }
}
