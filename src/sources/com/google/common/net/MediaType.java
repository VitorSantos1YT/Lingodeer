package com.google.common.net;

import a7.c;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class MediaType {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableListMultimap f17475f = ImmutableListMultimap.q(Ascii.c(StandardCharsets.UTF_8.name()));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CharMatcher f17476g = CharMatcher.e().b(CharMatcher.l().p()).b(CharMatcher.k()).b(CharMatcher.c("()<>@,;:\\\"/[]?=").p());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f17477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Joiner.MapJoiner f17478i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableListMultimap f17481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17483e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Tokenizer {
    }

    static {
        CharMatcher.e().b(CharMatcher.c("\"\\\r").p());
        CharMatcher.c(" \t\r\n");
        f17477h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        f17478i = new Joiner.MapJoiner(new Joiner("; "));
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f17479a = str;
        this.f17480b = str2;
        this.f17481c = immutableListMultimap;
    }

    public static void a(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, ImmutableListMultimap.p());
        f17477h.put(mediaType, mediaType);
        Optional.a();
    }

    public static void b(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, f17475f);
        f17477h.put(mediaType, mediaType);
        Optional.d(StandardCharsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (this.f17479a.equals(mediaType.f17479a) && this.f17480b.equals(mediaType.f17480b)) {
            return ((AbstractMap) Maps.i(this.f17481c.Y(), new c(2))).equals(Maps.i(mediaType.f17481c.Y(), new c(2)));
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f17483e;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.f17479a, this.f17480b, Maps.i(this.f17481c.Y(), new c(2))});
        this.f17483e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.f17482d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17479a);
        sb2.append('/');
        sb2.append(this.f17480b);
        ImmutableListMultimap immutableListMultimap = this.f17481c;
        if (!immutableListMultimap.isEmpty()) {
            sb2.append("; ");
            Collection collectionE = Multimaps.a(immutableListMultimap, new c(1)).e();
            Joiner.MapJoiner mapJoiner = f17478i;
            mapJoiner.getClass();
            try {
                mapJoiner.a(sb2, collectionE.iterator());
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
        String string = sb2.toString();
        this.f17482d = string;
        return string;
    }
}
