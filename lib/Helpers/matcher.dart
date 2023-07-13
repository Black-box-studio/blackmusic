import 'package:logging/logging.dart';

bool matchSongs({
  required String title,
  required String artist,
  required String title2,
  required String artist2,
  double artistFlexibility = 0.15,
  double titleFlexibility = 0.7,
  bool allowTitleToArtistMatch = true,
}) {
  Logger.root.info('Matching $title by $artist with $title2 by $artist2');
  final names1 = artist.replaceAll('&', ',').replaceAll('-', ',').split(',');
  final names2 = artist2.replaceAll('&', ',').replaceAll('-', ',').split(',');
  bool artistMatched = false;
  bool titleMatched = false;

  // Check if at least one artist name matches
  for (final String name1 in names1) {
    for (final String name2 in names2) {
      if (flexibleMatch(
        string1: name1,
        string2: name2,
        flexibility: artistFlexibility,
      )) {
        artistMatched = true;
        break;
      } else if (allowTitleToArtistMatch) {
        if (title2.contains(name1) || title.contains(name2)) {
          artistMatched = true;
          break;
        }
      }
    }
    if (artistMatched) {
      break;
    }
  }

  titleMatched = flexibleMatch(
    string1: title,
    string2: title2,
    wordMatch: true,
    flexibility: titleFlexibility,
  );

  Logger.root
      .info('TitleMatched: $titleMatched, ArtistMatched: $artistMatched');

  return artistMatched && titleMatched;
}

bool flexibleMatch({
  required String string1,
  required String string2,
  double flexibility = 0.7,
  bool wordMatch = false,
}) {
  final text1 = string1.toLowerCase().trim();
  final text2 = string2.toLowerCase().trim();
  if (text1 == text2) {
    return true;
  } else if (text1.contains(text2) || text2.contains(text1)) {
    return true;
  } else if (flexibility > 0) {
    final bool matched = flexibilityCheck(
      text1: text1,
      text2: text2,
      wordMatch: wordMatch,
      flexibility: flexibility,
    );
    if (matched) {
      return true;
    } else if (text1.contains('(') || text2.contains('(')) {
      return flexibilityCheck(
        text1: text1.split('(')[0].trim(),
        text2: text2.split('(')[0].trim(),
        wordMatch: wordMatch,
        flexibility: flexibility,
      );
    }
  }

  return false;
}

bool flexibilityCheck({
  required String text1,
  required String text2,
  required bool wordMatch,
  required double flexibility,
}) {
  int count = 0;
  final list1 = wordMatch ? text1.split(' ') : text1.split('');
  final list2 = wordMatch ? text2.split(' ') : text2.split('');
  final minLength = list1.length > list2.length ? list2.length : list1.length;

  for (int i = 0; i < minLength; i++) {
    if (list1[i] == list2[i]) {
      count++;
    } else {
      break;
    }
  }
  final percentage = count / minLength;
  if ((1 - percentage) <= flexibility) {
    return true;
  }
  return false;
}
