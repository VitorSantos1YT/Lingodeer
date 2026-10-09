package com.lingodeer.data.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UrlAdditionalInfo {
    private String code;
    private String content;
    private String contentId;
    private boolean forbid_defer;
    private String force_params;
    private boolean oib;
    private String optional_params;
    private String path;
    private String show_type;
    private String source;
    private String title;
    private String type;

    public UrlAdditionalInfo() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);
    }

    public static /* synthetic */ UrlAdditionalInfo copy$default(UrlAdditionalInfo urlAdditionalInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = urlAdditionalInfo.source;
        }
        if ((i11 & 2) != 0) {
            str2 = urlAdditionalInfo.type;
        }
        if ((i11 & 4) != 0) {
            str3 = urlAdditionalInfo.content;
        }
        if ((i11 & 8) != 0) {
            str4 = urlAdditionalInfo.title;
        }
        if ((i11 & 16) != 0) {
            str5 = urlAdditionalInfo.show_type;
        }
        if ((i11 & 32) != 0) {
            str6 = urlAdditionalInfo.contentId;
        }
        if ((i11 & 64) != 0) {
            str7 = urlAdditionalInfo.force_params;
        }
        if ((i11 & 128) != 0) {
            str8 = urlAdditionalInfo.optional_params;
        }
        if ((i11 & 256) != 0) {
            str9 = urlAdditionalInfo.code;
        }
        if ((i11 & 512) != 0) {
            str10 = urlAdditionalInfo.path;
        }
        if ((i11 & 1024) != 0) {
            z11 = urlAdditionalInfo.oib;
        }
        if ((i11 & 2048) != 0) {
            z12 = urlAdditionalInfo.forbid_defer;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return urlAdditionalInfo.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12, z13, z14);
    }

    public final String component1() {
        return this.source;
    }

    public final String component10() {
        return this.path;
    }

    public final boolean component11() {
        return this.oib;
    }

    public final boolean component12() {
        return this.forbid_defer;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.content;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.show_type;
    }

    public final String component6() {
        return this.contentId;
    }

    public final String component7() {
        return this.force_params;
    }

    public final String component8() {
        return this.optional_params;
    }

    public final String component9() {
        return this.code;
    }

    public final UrlAdditionalInfo copy(String source, String type, String content, String title, String show_type, String contentId, String force_params, String optional_params, String code, String path, boolean z11, boolean z12) {
        m.f(source, "source");
        m.f(type, "type");
        m.f(content, "content");
        m.f(title, "title");
        m.f(show_type, "show_type");
        m.f(contentId, "contentId");
        m.f(force_params, "force_params");
        m.f(optional_params, "optional_params");
        m.f(code, "code");
        m.f(path, "path");
        return new UrlAdditionalInfo(source, type, content, title, show_type, contentId, force_params, optional_params, code, path, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlAdditionalInfo)) {
            return false;
        }
        UrlAdditionalInfo urlAdditionalInfo = (UrlAdditionalInfo) obj;
        return m.a(this.source, urlAdditionalInfo.source) && m.a(this.type, urlAdditionalInfo.type) && m.a(this.content, urlAdditionalInfo.content) && m.a(this.title, urlAdditionalInfo.title) && m.a(this.show_type, urlAdditionalInfo.show_type) && m.a(this.contentId, urlAdditionalInfo.contentId) && m.a(this.force_params, urlAdditionalInfo.force_params) && m.a(this.optional_params, urlAdditionalInfo.optional_params) && m.a(this.code, urlAdditionalInfo.code) && m.a(this.path, urlAdditionalInfo.path) && this.oib == urlAdditionalInfo.oib && this.forbid_defer == urlAdditionalInfo.forbid_defer;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final boolean getForbid_defer() {
        return this.forbid_defer;
    }

    public final String getForce_params() {
        return this.force_params;
    }

    public final boolean getOib() {
        return this.oib;
    }

    public final String getOptional_params() {
        return this.optional_params;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShow_type() {
        return this.show_type;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.forbid_defer) + e.e(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(this.source.hashCode() * 31, 31, this.type), 31, this.content), 31, this.title), 31, this.show_type), 31, this.contentId), 31, this.force_params), 31, this.optional_params), 31, this.code), 31, this.path), 31, this.oib);
    }

    public final void setCode(String str) {
        m.f(str, "<set-?>");
        this.code = str;
    }

    public final void setContent(String str) {
        m.f(str, "<set-?>");
        this.content = str;
    }

    public final void setContentId(String str) {
        m.f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setForbid_defer(boolean z11) {
        this.forbid_defer = z11;
    }

    public final void setForce_params(String str) {
        m.f(str, "<set-?>");
        this.force_params = str;
    }

    public final void setOib(boolean z11) {
        this.oib = z11;
    }

    public final void setOptional_params(String str) {
        m.f(str, "<set-?>");
        this.optional_params = str;
    }

    public final void setPath(String str) {
        m.f(str, "<set-?>");
        this.path = str;
    }

    public final void setShow_type(String str) {
        m.f(str, "<set-?>");
        this.show_type = str;
    }

    public final void setSource(String str) {
        m.f(str, "<set-?>");
        this.source = str;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public final void setType(String str) {
        m.f(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        String str = this.source;
        String str2 = this.type;
        String str3 = this.content;
        String str4 = this.title;
        String str5 = this.show_type;
        String str6 = this.contentId;
        String str7 = this.force_params;
        String str8 = this.optional_params;
        String str9 = this.code;
        String str10 = this.path;
        boolean z11 = this.oib;
        boolean z12 = this.forbid_defer;
        StringBuilder sbS = e.s("UrlAdditionalInfo(source=", str, ", type=", str2, ", content=");
        d.w(sbS, str3, ", title=", str4, ", show_type=");
        d.w(sbS, str5, ", contentId=", str6, ", force_params=");
        d.w(sbS, str7, ", optional_params=", str8, ", code=");
        d.w(sbS, str9, ", path=", str10, ", oib=");
        sbS.append(z11);
        sbS.append(", forbid_defer=");
        sbS.append(z12);
        sbS.append(")");
        return sbS.toString();
    }

    public UrlAdditionalInfo(String source, String type, String content, String title, String show_type, String contentId, String force_params, String optional_params, String code, String path, boolean z11, boolean z12) {
        m.f(source, "source");
        m.f(type, "type");
        m.f(content, "content");
        m.f(title, "title");
        m.f(show_type, "show_type");
        m.f(contentId, "contentId");
        m.f(force_params, "force_params");
        m.f(optional_params, "optional_params");
        m.f(code, "code");
        m.f(path, "path");
        this.source = source;
        this.type = type;
        this.content = content;
        this.title = title;
        this.show_type = show_type;
        this.contentId = contentId;
        this.force_params = force_params;
        this.optional_params = optional_params;
        this.code = code;
        this.path = path;
        this.oib = z11;
        this.forbid_defer = z12;
    }

    public /* synthetic */ UrlAdditionalInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z11, boolean z12, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? false : z12);
    }
}
