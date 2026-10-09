package f8;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f26989a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f26990b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f26991c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static e a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!b7.a.x(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ImmutableList immutableListS = ImmutableList.s();
        long j11 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (b7.a.x(xmlPullParserNewPullParser, "rdf:Description")) {
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    String strR = b7.a.r(xmlPullParserNewPullParser, f26989a[i12]);
                    if (strR != null) {
                        if (Integer.parseInt(strR) != 1) {
                            break loop0;
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 < 4) {
                                String strR2 = b7.a.r(xmlPullParserNewPullParser, f26990b[i13]);
                                if (strR2 != null) {
                                    j11 = Long.parseLong(strR2);
                                    if (j11 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i13++;
                            }
                            j11 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i11 >= 2) {
                                immutableListS = ImmutableList.s();
                                break;
                            }
                            String strR3 = b7.a.r(xmlPullParserNewPullParser, f26991c[i11]);
                            if (strR3 != null) {
                                immutableListS = ImmutableList.v(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(strR3), 0L));
                                break;
                            }
                            i11++;
                        }
                    }
                }
                return null;
            }
            if (b7.a.x(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListS = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (b7.a.x(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListS = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!b7.a.v(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListS.isEmpty()) {
            break loop0;
        }
        return new e(j11, immutableListS, 2);
        return null;
    }

    public static ImmutableList b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strR = b7.a.r(xmlPullParser, strConcat3);
                String strR2 = b7.a.r(xmlPullParser, strConcat4);
                String strR3 = b7.a.r(xmlPullParser, strConcat5);
                String strR4 = b7.a.r(xmlPullParser, strConcat6);
                if (strR == null || strR2 == null) {
                    return ImmutableList.s();
                }
                builder.h(new b(strR, strR3 != null ? Long.parseLong(strR3) : 0L, strR4 != null ? Long.parseLong(strR4) : 0L));
            }
        } while (!b7.a.v(xmlPullParser, strConcat2));
        return builder.j();
    }
}
