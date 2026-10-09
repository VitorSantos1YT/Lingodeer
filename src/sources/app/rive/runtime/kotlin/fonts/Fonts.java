package app.rive.runtime.kotlin.fonts;

import com.google.logging.type.LogSeverity;
import defpackage.e;
import ep.a;
import hh.p0;
import hz.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import lz.g;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Fonts {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Axis {
        public static final int $stable = 0;
        private final String styleValue;
        private final String tag;

        public Axis(String tag, String styleValue) {
            m.f(tag, "tag");
            m.f(styleValue, "styleValue");
            this.tag = tag;
            this.styleValue = styleValue;
        }

        public static /* synthetic */ Axis copy$default(Axis axis, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = axis.tag;
            }
            if ((i11 & 2) != 0) {
                str2 = axis.styleValue;
            }
            return axis.copy(str, str2);
        }

        public final String component1() {
            return this.tag;
        }

        public final String component2() {
            return this.styleValue;
        }

        public final Axis copy(String tag, String styleValue) {
            m.f(tag, "tag");
            m.f(styleValue, "styleValue");
            return new Axis(tag, styleValue);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Axis)) {
                return false;
            }
            Axis axis = (Axis) obj;
            return m.a(this.tag, axis.tag) && m.a(this.styleValue, axis.styleValue);
        }

        public final String getStyleValue() {
            return this.styleValue;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return this.styleValue.hashCode() + (this.tag.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Axis(tag=");
            sb2.append(this.tag);
            sb2.append(", styleValue=");
            return p0.o(sb2, this.styleValue, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FontOpts {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final FontOpts DEFAULT = new FontOpts("sans-serif", null, null, null, 14, null);
        private final String familyName;
        private final String lang;
        private final String style;
        private final Weight weight;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final FontOpts getDEFAULT() {
                return FontOpts.DEFAULT;
            }

            private Companion() {
            }
        }

        public FontOpts() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ FontOpts copy$default(FontOpts fontOpts, String str, String str2, Weight weight, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fontOpts.familyName;
            }
            if ((i11 & 2) != 0) {
                str2 = fontOpts.lang;
            }
            if ((i11 & 4) != 0) {
                weight = fontOpts.weight;
            }
            if ((i11 & 8) != 0) {
                str3 = fontOpts.style;
            }
            return fontOpts.copy(str, str2, weight, str3);
        }

        public final String component1() {
            return this.familyName;
        }

        public final String component2() {
            return this.lang;
        }

        public final Weight component3() {
            return this.weight;
        }

        public final String component4() {
            return this.style;
        }

        public final FontOpts copy(String str, String str2, Weight weight, String str3) {
            return new FontOpts(str, str2, weight, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FontOpts)) {
                return false;
            }
            FontOpts fontOpts = (FontOpts) obj;
            return m.a(this.familyName, fontOpts.familyName) && m.a(this.lang, fontOpts.lang) && m.a(this.weight, fontOpts.weight) && m.a(this.style, fontOpts.style);
        }

        public final String getFamilyName() {
            return this.familyName;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getStyle() {
            return this.style;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.familyName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lang;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Weight weight = this.weight;
            int iHashCode3 = (iHashCode2 + (weight == null ? 0 : weight.hashCode())) * 31;
            String str3 = this.style;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FontOpts(familyName=");
            sb2.append(this.familyName);
            sb2.append(", lang=");
            sb2.append(this.lang);
            sb2.append(", weight=");
            sb2.append(this.weight);
            sb2.append(", style=");
            return p0.o(sb2, this.style, ')');
        }

        public FontOpts(String str, String str2, Weight weight, String str3) {
            this.familyName = str;
            this.lang = str2;
            this.weight = weight;
            this.style = str3;
        }

        public /* synthetic */ FontOpts(String str, String str2, Weight weight, String str3, int i11, f fVar) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? Weight.Companion.getNORMAL() : weight, (i11 & 8) != 0 ? "normal" : str3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Weight implements Comparable<Weight> {
        public static final int $stable = 0;
        private final int weight;
        public static final Companion Companion = new Companion(null);
        private static final Weight NORMAL = new Weight(400);
        private static final Weight BOLD = new Weight(LogSeverity.ALERT_VALUE);

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public static /* synthetic */ Weight fromInt$default(Companion companion, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = 400;
                }
                return companion.fromInt(i11);
            }

            public final Weight fromInt(int i11) {
                return new Weight(b.m(i11, new g(0, 1000, 1)));
            }

            public final Weight fromString(String str) {
                Integer numT0;
                return new Weight((str == null || (numT0 = x.t0(str)) == null) ? 400 : b.m(numT0.intValue(), new g(0, 1000, 1)));
            }

            public final Weight getBOLD() {
                return Weight.BOLD;
            }

            public final Weight getNORMAL() {
                return Weight.NORMAL;
            }

            private Companion() {
            }
        }

        public Weight() {
            this(0, 1, null);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = weight.weight;
            }
            return weight.copy(i11);
        }

        public final int component1() {
            return this.weight;
        }

        public final Weight copy(int i11) {
            return new Weight(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Weight) && this.weight == ((Weight) obj).weight;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Integer.hashCode(this.weight);
        }

        public String toString() {
            return a.j(new StringBuilder("Weight(weight="), this.weight, ')');
        }

        public Weight(int i11) {
            this.weight = i11;
        }

        @Override // java.lang.Comparable
        public int compareTo(Weight other) {
            m.f(other, "other");
            return m.h(this.weight, other.weight);
        }

        public /* synthetic */ Weight(int i11, int i12, f fVar) {
            this((i12 & 1) != 0 ? 400 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Alias {
        public static final int $stable = 0;
        private final String name;
        private final String original;
        private final Weight weight;

        public Alias(String name, String original, Weight weight) {
            m.f(name, "name");
            m.f(original, "original");
            this.name = name;
            this.original = original;
            this.weight = weight;
        }

        public static /* synthetic */ Alias copy$default(Alias alias, String str, String str2, Weight weight, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = alias.name;
            }
            if ((i11 & 2) != 0) {
                str2 = alias.original;
            }
            if ((i11 & 4) != 0) {
                weight = alias.weight;
            }
            return alias.copy(str, str2, weight);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.original;
        }

        public final Weight component3() {
            return this.weight;
        }

        public final Alias copy(String name, String original, Weight weight) {
            m.f(name, "name");
            m.f(original, "original");
            return new Alias(name, original, weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) obj;
            return m.a(this.name, alias.name) && m.a(this.original, alias.original) && m.a(this.weight, alias.weight);
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = e.d(this.name.hashCode() * 31, 31, this.original);
            Weight weight = this.weight;
            return iD + (weight == null ? 0 : weight.hashCode());
        }

        public String toString() {
            return "Alias(name=" + this.name + ", original=" + this.original + ", weight=" + this.weight + ')';
        }

        public /* synthetic */ Alias(String str, String str2, Weight weight, int i11, f fVar) {
            this(str, str2, (i11 & 4) != 0 ? Weight.Companion.getNORMAL() : weight);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FileFont {
        public static final int $stable = 0;
        private final String lang;
        private final String name;
        private final String variant;

        public FileFont(String name, String str, String str2) {
            m.f(name, "name");
            this.name = name;
            this.variant = str;
            this.lang = str2;
        }

        public static /* synthetic */ FileFont copy$default(FileFont fileFont, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fileFont.name;
            }
            if ((i11 & 2) != 0) {
                str2 = fileFont.variant;
            }
            if ((i11 & 4) != 0) {
                str3 = fileFont.lang;
            }
            return fileFont.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.variant;
        }

        public final String component3() {
            return this.lang;
        }

        public final FileFont copy(String name, String str, String str2) {
            m.f(name, "name");
            return new FileFont(name, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileFont)) {
                return false;
            }
            FileFont fileFont = (FileFont) obj;
            return m.a(this.name, fileFont.name) && m.a(this.variant, fileFont.variant) && m.a(this.lang, fileFont.lang);
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.variant;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lang;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FileFont(name=");
            sb2.append(this.name);
            sb2.append(", variant=");
            sb2.append(this.variant);
            sb2.append(", lang=");
            return p0.o(sb2, this.lang, ')');
        }

        public /* synthetic */ FileFont(String str, String str2, String str3, int i11, f fVar) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Family {
        public static final int $stable = 8;
        private final Map<Weight, List<Font>> fonts;
        private final String lang;
        private final String name;
        private final String variant;

        /* JADX WARN: Multi-variable type inference failed */
        public Family(String str, String str2, String str3, Map<Weight, ? extends List<Font>> fonts) {
            m.f(fonts, "fonts");
            this.name = str;
            this.variant = str2;
            this.lang = str3;
            this.fonts = fonts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = family.name;
            }
            if ((i11 & 2) != 0) {
                str2 = family.variant;
            }
            if ((i11 & 4) != 0) {
                str3 = family.lang;
            }
            if ((i11 & 8) != 0) {
                map = family.fonts;
            }
            return family.copy(str, str2, str3, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.variant;
        }

        public final String component3() {
            return this.lang;
        }

        public final Map<Weight, List<Font>> component4() {
            return this.fonts;
        }

        public final Family copy(String str, String str2, String str3, Map<Weight, ? extends List<Font>> fonts) {
            m.f(fonts, "fonts");
            return new Family(str, str2, str3, fonts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Family)) {
                return false;
            }
            Family family = (Family) obj;
            return m.a(this.name, family.name) && m.a(this.variant, family.variant) && m.a(this.lang, family.lang) && m.a(this.fonts, family.fonts);
        }

        public final Map<Weight, List<Font>> getFonts() {
            return this.fonts;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.variant;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lang;
            return this.fonts.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Family(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ", fonts=" + this.fonts + ')';
        }

        public /* synthetic */ Family(String str, String str2, String str3, Map map, int i11, f fVar) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Font {
        public static final String STYLE_ITALIC = "italic";
        public static final String STYLE_NORMAL = "normal";
        private final List<Axis> axis;
        private final String fallbackFor;
        private final String name;
        private final String postScriptName;
        private final String style;
        private final int ttcIndex;
        private final Weight weight;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private Companion() {
            }
        }

        public Font(Weight weight, String style, String name, List<Axis> list, int i11, String str, String str2) {
            m.f(weight, "weight");
            m.f(style, "style");
            m.f(name, "name");
            this.weight = weight;
            this.style = style;
            this.name = name;
            this.axis = list;
            this.ttcIndex = i11;
            this.postScriptName = str;
            this.fallbackFor = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Font copy$default(Font font, Weight weight, String str, String str2, List list, int i11, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                weight = font.weight;
            }
            if ((i12 & 2) != 0) {
                str = font.style;
            }
            if ((i12 & 4) != 0) {
                str2 = font.name;
            }
            if ((i12 & 8) != 0) {
                list = font.axis;
            }
            if ((i12 & 16) != 0) {
                i11 = font.ttcIndex;
            }
            if ((i12 & 32) != 0) {
                str3 = font.postScriptName;
            }
            if ((i12 & 64) != 0) {
                str4 = font.fallbackFor;
            }
            String str5 = str3;
            String str6 = str4;
            int i13 = i11;
            String str7 = str2;
            return font.copy(weight, str, str7, list, i13, str5, str6);
        }

        public final Weight component1() {
            return this.weight;
        }

        public final String component2() {
            return this.style;
        }

        public final String component3() {
            return this.name;
        }

        public final List<Axis> component4() {
            return this.axis;
        }

        public final int component5() {
            return this.ttcIndex;
        }

        public final String component6() {
            return this.postScriptName;
        }

        public final String component7() {
            return this.fallbackFor;
        }

        public final Font copy(Weight weight, String style, String name, List<Axis> list, int i11, String str, String str2) {
            m.f(weight, "weight");
            m.f(style, "style");
            m.f(name, "name");
            return new Font(weight, style, name, list, i11, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Font)) {
                return false;
            }
            Font font = (Font) obj;
            return m.a(this.weight, font.weight) && m.a(this.style, font.style) && m.a(this.name, font.name) && m.a(this.axis, font.axis) && this.ttcIndex == font.ttcIndex && m.a(this.postScriptName, font.postScriptName) && m.a(this.fallbackFor, font.fallbackFor);
        }

        public final List<Axis> getAxis() {
            return this.axis;
        }

        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPostScriptName() {
            return this.postScriptName;
        }

        public final String getStyle() {
            return this.style;
        }

        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = e.d(e.d(this.weight.hashCode() * 31, 31, this.style), 31, this.name);
            List<Axis> list = this.axis;
            int iB = e.b(this.ttcIndex, (iD + (list == null ? 0 : list.hashCode())) * 31, 31);
            String str = this.postScriptName;
            int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fallbackFor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Font(weight=");
            sb2.append(this.weight);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", axis=");
            sb2.append(this.axis);
            sb2.append(", ttcIndex=");
            sb2.append(this.ttcIndex);
            sb2.append(", postScriptName=");
            sb2.append(this.postScriptName);
            sb2.append(", fallbackFor=");
            return p0.o(sb2, this.fallbackFor, ')');
        }

        public /* synthetic */ Font(Weight weight, String str, String str2, List list, int i11, String str3, String str4, int i12, f fVar) {
            this(weight, str, str2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4);
        }
    }
}
