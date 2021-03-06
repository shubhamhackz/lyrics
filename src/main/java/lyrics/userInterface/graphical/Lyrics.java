/*
 *	Mario Sangiorgio - mariosangiorgio AT gmail DOT com
 *
 *  This file is part of lyrics.
 * 
 *  lyrics is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  lyrics is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with lyrics.  If not, see <http://www.gnu.org/licenses/>.
 */

package lyrics.userInterface.graphical;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

public class Lyrics {
	public static void main(String[] args) {
		// Suppressing jaudiotagger loggers
		String[] loggers = { "org.jaudiotagger.audio",
				"org.jaudiotagger.tag.id3", "org.jaudiotagger.tag.datatype" };
		for (String loggerName : loggers) {
			Logger.getLogger(loggerName).setLevel(Level.OFF);
		}
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainWindow = new MainWindow();
		mainWindow.setVisible(true);
	}

}
