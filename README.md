# Music Visualiser Project

Name: Wedaad Haruna

Student Number: C19303066

## Instructions
- Press the space bar - once pressed the song BadLiar starts playing and the visual starts to move according to the music
- To change the visual on the screen use the number keys from 0 - 5 (inclusive) which calls the different visual classes within a switch case in WedaadVisual.java
- When no key is pressed at the beginning you will see a flower
- when key 1 is pressed two circles are rendered to the screen
- When key 2 is press two circles and a sphere are rendered to the screen
- When keys 3 - 5 are pressed different visuals are rendered to the screen
- Press the space bar again to start song from the beginning
- Enjoy! 

# Description of the assignment

# Instructions

# How it works
1. Press the space bar to start playing the song with the viusal. The visual works best with BadLiar.mp3
2. The main method calls on WedaadsVisual
3. Run the main method

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

